package com.example.rcache;

import java.awt.List;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

@AutoProtoSchemaBuilder(includeClasses = {BasqueName.class, Address.class,List.class})
public interface BasquesNamesSchemaBuilder extends GeneratedSchema {
}