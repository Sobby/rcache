package com.example.rcache;

import java.util.List;

import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import lombok.Data;

@Data
public class Address {
    private List<String> addr ;

    @ProtoFactory
    public Address(List<String> addr) {
        this.addr = addr;
    }

    @ProtoField(value = 1, required = false)
    public List<String> getAddr(){
        return addr;
    }
    
}
