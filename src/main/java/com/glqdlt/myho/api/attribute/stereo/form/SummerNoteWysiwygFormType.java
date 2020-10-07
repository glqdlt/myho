package com.glqdlt.myho.api.attribute.stereo.form;

import java.util.function.Function;

public class SummerNoteWysiwygFormType implements WysiwygFormType {

    @Override
    public Class<String> getValueType() {
        return String.class;
    }

    @Override
    public Function<String, String> getDrawSourceResolver() {
        return key -> String.format("<textarea data-myho-attribute-id='%s' summer-note></textarea>", key);
    }

}
