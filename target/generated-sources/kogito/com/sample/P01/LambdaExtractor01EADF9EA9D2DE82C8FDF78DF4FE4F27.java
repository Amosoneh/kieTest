package com.sample.P01;


import static com.sample.Rulese906ee61162845cab75a0d89c019e0b2.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor01EADF9EA9D2DE82C8FDF78DF4FE4F27 implements org.drools.model.functions.Function1<com.sample.Person, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "0BE1BEEA12BE8A8B0F6611C3E1A7EA00";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(com.sample.Person _this) {
        return _this.getAge();
    }
}
