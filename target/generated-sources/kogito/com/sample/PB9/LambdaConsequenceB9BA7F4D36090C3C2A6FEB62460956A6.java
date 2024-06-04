package com.sample.PB9;


import static com.sample.Rulesa561047e4e7e4a2791be463ba66bdc44.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceB9BA7F4D36090C3C2A6FEB62460956A6 implements org.drools.model.functions.Block2<org.drools.model.Drools, com.sample.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "973B19CC46E74376C90946BE5563BDD9";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataa561047e4e7e4a2791be463ba66bdc44.com_sample_Person_Metadata_INSTANCE, "adult");

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
