package com.sample;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.sample.Person;
import static com.sample.Rulesb1f37ddbadd340e6b9621c9647be6d00.*;
import static com.sample.Rulesb1f37ddbadd340e6b9621c9647be6d00.*;

public class Rulesb1f37ddbadd340e6b9621c9647be6d00_rule_isAdult {

    /**
     * Rule name: isAdult
     */
    public static org.drools.model.Rule rule_isAdult() {
        final org.drools.model.Variable<com.sample.Person> var_$person = D.declarationOf(com.sample.Person.class,
                                                                                         DomainClassesMetadatab1f37ddbadd340e6b9621c9647be6d00.com_sample_Person_Metadata_INSTANCE,
                                                                                         "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatab1f37ddbadd340e6b9621c9647be6d00.com_sample_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("com.sample",
                                            "isAdult")
                                      .build(D.pattern(var_$person).expr("GENERATED_3CC8CD9E65F11B356E8907D5C55B47AB",
                                                                         com.sample.PBF.LambdaPredicateBF0C9EDC615414580E479607A92E6C9E.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatab1f37ddbadd340e6b9621c9647be6d00.com_sample_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          com.sample.PF3.LambdaExtractorF372AC1BA509D6C476516CA304C1B987.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(com.sample.PAB.LambdaConsequenceAB7D93F630C9913AE79D37A49C48AAA0.INSTANCE));
        return rule;
    }
}
