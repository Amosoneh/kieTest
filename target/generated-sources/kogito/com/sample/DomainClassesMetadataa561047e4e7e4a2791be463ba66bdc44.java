package com.sample;
public class DomainClassesMetadataa561047e4e7e4a2791be463ba66bdc44 {

    public static final org.drools.model.DomainClassMetadata com_sample_Person_Metadata_INSTANCE = new com_sample_Person_Metadata();
    private static class com_sample_Person_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.sample.Person.class;
        }

        @Override
        public int getPropertiesSize() {
            return 4;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "adult": return 1;
                case "age": return 2;
                case "name": return 3;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.sample.Person");
        }
    }
}