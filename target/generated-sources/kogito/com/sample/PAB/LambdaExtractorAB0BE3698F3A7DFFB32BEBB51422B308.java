package com.sample.PAB;


import static com.sample.Rules6b11c83e8d884c7dbe3c32c1c87acacd.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorAB0BE3698F3A7DFFB32BEBB51422B308 implements org.drools.model.functions.Function1<com.sample.Person, Integer>, org.drools.model.functions.HashedExpression {

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
