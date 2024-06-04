package com.sample.PF5;


import static com.sample.Rules7c389c7919674a77bae9acf06438a5c8.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceF54312513D2A8673A1A6EBB1AEDB4B23 implements org.drools.model.functions.Block2<org.drools.model.Drools, com.sample.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "973B19CC46E74376C90946BE5563BDD9";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata7c389c7919674a77bae9acf06438a5c8.com_sample_Person_Metadata_INSTANCE, "adult");

    @Override()
    public void execute(org.drools.model.Drools drools, com.sample.Person $person) throws java.lang.Exception {
        {
            {
                ($person).setAdult(true);
            }
            drools.update($person, mask_$person);
        }
    }
}
