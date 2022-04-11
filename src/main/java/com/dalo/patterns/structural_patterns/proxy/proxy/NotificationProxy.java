package com.dalo.patterns.structural_patterns.proxy.proxy;

import com.dalo.patterns.structural_patterns.proxy.dao.EmployeeDao;
import com.dalo.patterns.structural_patterns.proxy.model.Employee;
import com.dalo.patterns.structural_patterns.proxy.service.NotificationService;

public class NotificationProxy implements EmployeeDao {
    private EmployeeDao employeeDaoWrapped;
    private NotificationService notificationService;

    public NotificationProxy(EmployeeDao employeeDao, NotificationService notificationService) {
        employeeDaoWrapped = employeeDao;
        this.notificationService = notificationService;
    }

    @Override
    public Employee getEmployeeByName(String name) {
        Employee employee = employeeDaoWrapped.getEmployeeByName(name);
        notificationService.sendMessage(employee, "Message");
        return employee;
    }
}
