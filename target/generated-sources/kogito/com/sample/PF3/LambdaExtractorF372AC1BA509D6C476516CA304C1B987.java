package com.sample.PF3;


import static com.sample.Rulesb1f37ddbadd340e6b9621c9647be6d00.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorF372AC1BA509D6C476516CA304C1B987 implements org.drools.model.functions.Function1<com.sample.Person, Integer>, org.drools.model.functions.HashedExpression {

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
