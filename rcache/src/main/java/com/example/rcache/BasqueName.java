package com.example.rcache;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import lombok.Data;

@Data
public class BasqueName {

    private final String id;
    private final String name;
    private final Address test;
    // private final Address address;

    @ProtoFactory
    public BasqueName(String id, String name, Address test ) {
        this.id = id;
        this.name = name;
        this.test = test;
    }

    @ProtoField(value = 1, required = true)
    public String getId() {
        return id;
    }

    @ProtoField(value = 2, required = true)
    public String getName() {
        return this.name;
    }

    @ProtoField(value = 3, required = true)
    public Address getTest() {
        return this.test;
    }

}