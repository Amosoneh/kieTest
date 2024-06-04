package com.sample.PE8;


import static com.sample.Rules7c389c7919674a77bae9acf06438a5c8.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateE8458DC00DAAED7BBA909A00E60080ED implements org.drools.model.functions.Predicate1<com.sample.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "501CE4F67B99EBF1ACE17416DB1449B7";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.sample.Person _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAge(), 18);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("age > 18");
        info.addRuleNames("isAdult", "C:/Users/Amos Khaled/Desktop/sample-kogito/src/main/resources/PersonRules.drl");
        return info;
    }
}
