package com.glqdlt.myho.api.attribute.stereo.form;

import java.util.function.Function;

public class AttributeFormTypeStereo {
    public static final StringFormType STRING_TYPE = new StringFormType() {

        @Override
        public Class<String> getValueType() {
            return String.class;
        }

        @Override
        public Function<String, String> getDrawSourceResolver() {
            return null;
        }

        @Override
        public Integer getTypeNumber() {
            return 1;
        }
    };
}
