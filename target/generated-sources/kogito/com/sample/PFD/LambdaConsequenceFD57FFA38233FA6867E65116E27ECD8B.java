package com.sample.PFD;


import static com.sample.Rulesb1164f82050c4fdaacdaa4479d9078c3.*;
import com.sample.Person;
import com.sample.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceFD57FFA38233FA6867E65116E27ECD8B implements org.drools.model.functions.Block2<org.drools.model.Drools, com.sample.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "973B19CC46E74376C90946BE5563BDD9";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatab1164f82050c4fdaacdaa4479d9078c3.com_sample_Person_Metadata_INSTANCE, "adult");

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
