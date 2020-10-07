package com.glqdlt.myho.api.attribute.stereo.form;

import com.glqdlt.myho.api.RangeTime;
import com.glqdlt.myho.api.attribute.AttributeFormType;

import java.util.function.Function;
import java.util.stream.Stream;

public enum AttributeFormTypeEnum implements AttributeFormType {

    FileFormType {
        @Override
        public Class getValueType() {
            return String.class;
        }

        @Override
        public Function<String, String> getDrawSourceResolver() {
            return null;
        }
    },
    LinkFormType {
        @Override
        public Class getValueType() {
            return String.class;
        }

        @Override
        public Function<String, String> getDrawSourceResolver() {
            return null;
        }

    },
    NumberFormType {
        @Override
        public Class getValueType() {
            return Long.class;
        }

        @Override
        public Function<String, String> getDrawSourceResolver() {
            return null;
        }

    },
    RangeTimeFormType {
        @Override
        public Class getValueType() {
            return RangeTime.class;
        }

        @Override
        public Function<String, String> getDrawSourceResolver() {
            return null;
        }
    },
    StringFormType {
        @Override
        public Class getValueType() {
            return AttributeFormTypeStereo.STRING_TYPE.getClass();
        }

        @Override
        public Function<String, String> getDrawSourceResolver() {
            return null;
        }
    };


    @Override
    public Integer getTypeNumber() {
        return ordinal();
    }

    public static AttributeFormType<?> valueOf(Integer ordinal) {
        return Stream.of(AttributeFormTypeEnum.values()).filter(x -> x.ordinal() == ordinal)
                .map(x -> (AttributeFormType<?>) x)
                .findAny().orElse(new AttributeFormType() {
                    @Override
                    public Class getValueType() {
                        return Object.class;
                    }

                    @Override
                    public Function<String, String> getDrawSourceResolver() {
                        return null;
                    }

                    @Override
                    public Integer getTypeNumber() {
                        return ordinal;
                    }
                });
    }
}
