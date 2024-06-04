package com.sample;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.sample.Person;
import static com.sample.Rules6b11c83e8d884c7dbe3c32c1c87acacd.*;
import static com.sample.Rules6b11c83e8d884c7dbe3c32c1c87acacd.*;

public class Rules6b11c83e8d884c7dbe3c32c1c87acacd_rule_isAdult {

    /**
     * Rule name: isAdult
     */
    public static org.drools.model.Rule rule_isAdult() {
        final org.drools.model.Variable<com.sample.Person> var_$person = D.declarationOf(com.sample.Person.class,
                                                                                         DomainClassesMetadata6b11c83e8d884c7dbe3c32c1c87acacd.com_sample_Person_Metadata_INSTANCE,
                                                                                         "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata6b11c83e8d884c7dbe3c32c1c87acacd.com_sample_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("com.sample",
                                            "isAdult")
                                      .build(D.pattern(var_$person).expr("GENERATED_3CC8CD9E65F11B356E8907D5C55B47AB",
                                                                         com.sample.P9C.LambdaPredicate9CBE154912212AE3BFF1261595951B8E.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata6b11c83e8d884c7dbe3c32c1c87acacd.com_sample_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          com.sample.PAB.LambdaExtractorAB0BE3698F3A7DFFB32BEBB51422B308.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(com.sample.PF1.LambdaConsequenceF19596A7C88AD77D93D70D8EFE8DF070.INSTANCE));
        return rule;
    }
}
