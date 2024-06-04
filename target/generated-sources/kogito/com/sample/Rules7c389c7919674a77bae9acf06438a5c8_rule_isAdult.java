package com.sample;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.sample.Person;
import static com.sample.Rules7c389c7919674a77bae9acf06438a5c8.*;
import static com.sample.Rules7c389c7919674a77bae9acf06438a5c8.*;

public class Rules7c389c7919674a77bae9acf06438a5c8_rule_isAdult {

    /**
     * Rule name: isAdult
     */
    public static org.drools.model.Rule rule_isAdult() {
        final org.drools.model.Variable<com.sample.Person> var_$person = D.declarationOf(com.sample.Person.class,
                                                                                         DomainClassesMetadata7c389c7919674a77bae9acf06438a5c8.com_sample_Person_Metadata_INSTANCE,
                                                                                         "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata7c389c7919674a77bae9acf06438a5c8.com_sample_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("com.sample",
                                            "isAdult")
                                      .build(D.pattern(var_$person).expr("GENERATED_3CC8CD9E65F11B356E8907D5C55B47AB",
                                                                         com.sample.PE8.LambdaPredicateE8458DC00DAAED7BBA909A00E60080ED.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata7c389c7919674a77bae9acf06438a5c8.com_sample_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          com.sample.P5D.LambdaExtractor5DACEE01001C4C045ED906A0A1BDFAF3.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(com.sample.PF5.LambdaConsequenceF54312513D2A8673A1A6EBB1AEDB4B23.INSTANCE));
        return rule;
    }
}
