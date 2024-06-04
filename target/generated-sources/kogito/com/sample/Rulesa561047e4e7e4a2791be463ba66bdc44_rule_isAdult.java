package com.sample;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.sample.Person;
import static com.sample.Rulesa561047e4e7e4a2791be463ba66bdc44.*;
import static com.sample.Rulesa561047e4e7e4a2791be463ba66bdc44.*;

public class Rulesa561047e4e7e4a2791be463ba66bdc44_rule_isAdult {

    /**
     * Rule name: isAdult
     */
    public static org.drools.model.Rule rule_isAdult() {
        final org.drools.model.Variable<com.sample.Person> var_$person = D.declarationOf(com.sample.Person.class,
                                                                                         DomainClassesMetadataa561047e4e7e4a2791be463ba66bdc44.com_sample_Person_Metadata_INSTANCE,
                                                                                         "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataa561047e4e7e4a2791be463ba66bdc44.com_sample_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("com.sample",
                                            "isAdult")
                                      .build(D.pattern(var_$person).expr("GENERATED_3CC8CD9E65F11B356E8907D5C55B47AB",
                                                                         com.sample.PF1.LambdaPredicateF1C28AAAC76F5049E3C7D427188688EF.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadataa561047e4e7e4a2791be463ba66bdc44.com_sample_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          com.sample.P28.LambdaExtractor28120829346D8564963A2B9F63BF6C29.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(com.sample.PB9.LambdaConsequenceB9BA7F4D36090C3C2A6FEB62460956A6.INSTANCE));
        return rule;
    }
}
