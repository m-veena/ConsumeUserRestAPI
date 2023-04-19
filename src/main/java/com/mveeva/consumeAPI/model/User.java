package com.mveeva.consumeAPI.model;

public record User(Integer id, String name, String username, String email, Address address, Company company) {}
