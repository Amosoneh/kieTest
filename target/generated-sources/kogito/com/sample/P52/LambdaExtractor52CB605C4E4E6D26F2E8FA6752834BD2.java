package com.sample.P52;


import static com.sample.Rules540828afdc5b42b6aee61345a0014903.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor52CB605C4E4E6D26F2E8FA6752834BD2 implements org.drools.model.functions.Function1<com.sample.Person, Integer>, org.drools.model.functions.HashedExpression {

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
