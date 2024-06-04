package com.sample.P95;


import static com.sample.Rules540828afdc5b42b6aee61345a0014903.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate955B109E7833F1F9E61B53618C57E281 implements org.drools.model.functions.Predicate1<com.sample.Person>, org.drools.model.functions.HashedExpression {

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
