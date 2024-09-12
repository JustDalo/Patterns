package com.dalo.patterns.structural_patterns.proxy.service;

import com.dalo.patterns.structural_patterns.proxy.model.Employee;

public interface NotificationService {
    void sendMessage(Employee employee, String message);
}
