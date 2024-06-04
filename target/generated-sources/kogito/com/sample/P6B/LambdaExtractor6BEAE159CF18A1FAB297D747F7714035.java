package com.sample.P6B;


import static com.sample.Rulesb1164f82050c4fdaacdaa4479d9078c3.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor6BEAE159CF18A1FAB297D747F7714035 implements org.drools.model.functions.Function1<com.sample.Person, Integer>, org.drools.model.functions.HashedExpression {

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
