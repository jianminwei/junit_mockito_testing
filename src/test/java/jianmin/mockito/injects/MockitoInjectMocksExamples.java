package jianmin.mockito.injects;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
//public class MockitoInjectMocksExamples extends BaseTestCase{
public class MockitoInjectMocksExamples {

    @Mock EmailService emailService;

    @Mock SMSService smsService;

    @InjectMocks AppServices appServicesConstructorInjectionMock;

    @InjectMocks AppServices1 appServicesSetterInjectionMock;

    @InjectMocks AppServices2 appServicesFieldInjectionMock;

    @Test
    void test_constructor_injection_mock() {

        //test constructor injected
        when(appServicesConstructorInjectionMock.sendEmail("Email")).thenReturn(true);
        when(appServicesConstructorInjectionMock.sendSMS(anyString())).thenReturn(true);

        assertTrue(appServicesConstructorInjectionMock.sendEmail("Email"));
        assertFalse(appServicesConstructorInjectionMock.sendEmail("Unstubbed Email"));

        assertTrue(appServicesConstructorInjectionMock.sendSMS("SMS"));


        //test setter injected
        when(appServicesSetterInjectionMock.sendEmail("Email")).thenReturn(true);
        when(appServicesSetterInjectionMock.sendSMS(anyString())).thenReturn(true);

        assertTrue(appServicesSetterInjectionMock.sendEmail("Email"));
        assertFalse(appServicesSetterInjectionMock.sendEmail("Unstubbed Email"));

        assertTrue(appServicesSetterInjectionMock.sendSMS("SMS"));

        //test field injected
        when(appServicesFieldInjectionMock.sendEmail("Email")).thenReturn(true);
        when(appServicesFieldInjectionMock.sendSMS(anyString())).thenReturn(true);

        assertTrue(appServicesFieldInjectionMock.sendEmail("Email"));
        assertFalse(appServicesFieldInjectionMock.sendEmail("Unstubbed Email"));

        assertTrue(appServicesFieldInjectionMock.sendSMS("SMS"));
    }
}

