package com.sample;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.sample.Person;
import static com.sample.Rulese906ee61162845cab75a0d89c019e0b2.*;
import static com.sample.Rulese906ee61162845cab75a0d89c019e0b2.*;

public class Rulese906ee61162845cab75a0d89c019e0b2_rule_isAdult {

    /**
     * Rule name: isAdult
     */
    public static org.drools.model.Rule rule_isAdult() {
        final org.drools.model.Variable<com.sample.Person> var_$person = D.declarationOf(com.sample.Person.class,
                                                                                         DomainClassesMetadatae906ee61162845cab75a0d89c019e0b2.com_sample_Person_Metadata_INSTANCE,
                                                                                         "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae906ee61162845cab75a0d89c019e0b2.com_sample_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("com.sample",
                                            "isAdult")
                                      .build(D.pattern(var_$person).expr("GENERATED_3CC8CD9E65F11B356E8907D5C55B47AB",
                                                                         com.sample.PA7.LambdaPredicateA7AB0A62FD132A0E216F1691A39A5EDB.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatae906ee61162845cab75a0d89c019e0b2.com_sample_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          com.sample.P01.LambdaExtractor01EADF9EA9D2DE82C8FDF78DF4FE4F27.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(com.sample.P96.LambdaConsequence96FB7275CCE8D85ED69EC36CCA8F7323.INSTANCE));
        return rule;
    }
}
