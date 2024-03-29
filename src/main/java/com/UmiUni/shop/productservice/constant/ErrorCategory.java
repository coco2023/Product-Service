package com.UmiUni.shop.productservice.constant;

public enum ErrorCategory {
    TRANSIENT, // e.g., network issues
    CLIENT_EXIT,
    CLIENT_ERROR, // e.g., invalid input from the user
    SERVER_ERROR, // e.g., database failures
    CRITICAL, // e.g., security issues or major failures
    ORDER_EXPIRED,
    RECONCILE_PAYMENT_NOT_EXIT_IN_DB,
    RECONCILE_PAYMENT_RECORDS_NOT_MATCH,
    OTHER_RECONCILE_ERROR,
    PRODUCT_NOT_FOUND,
    INSUFFICIENT_STOCK,
    AMQP_ERROR,
}
