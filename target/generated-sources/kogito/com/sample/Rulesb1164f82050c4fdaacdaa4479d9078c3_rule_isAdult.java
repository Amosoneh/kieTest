package com.sample;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.sample.Person;
import static com.sample.Rulesb1164f82050c4fdaacdaa4479d9078c3.*;
import static com.sample.Rulesb1164f82050c4fdaacdaa4479d9078c3.*;

public class Rulesb1164f82050c4fdaacdaa4479d9078c3_rule_isAdult {

    /**
     * Rule name: isAdult
     */
    public static org.drools.model.Rule rule_isAdult() {
        final org.drools.model.Variable<com.sample.Person> var_$person = D.declarationOf(com.sample.Person.class,
                                                                                         DomainClassesMetadatab1164f82050c4fdaacdaa4479d9078c3.com_sample_Person_Metadata_INSTANCE,
                                                                                         "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatab1164f82050c4fdaacdaa4479d9078c3.com_sample_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("com.sample",
                                            "isAdult")
                                      .build(D.pattern(var_$person).expr("GENERATED_3CC8CD9E65F11B356E8907D5C55B47AB",
                                                                         com.sample.P64.LambdaPredicate6416766B29D9C199E65D792C21B9757C.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatab1164f82050c4fdaacdaa4479d9078c3.com_sample_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          com.sample.P6B.LambdaExtractor6BEAE159CF18A1FAB297D747F7714035.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(com.sample.PFD.LambdaConsequenceFD57FFA38233FA6867E65116E27ECD8B.INSTANCE));
        return rule;
    }
}
