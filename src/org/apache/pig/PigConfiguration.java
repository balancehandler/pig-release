/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.pig;

/**
 * Container for static configuration strings, defaults, etc. This is intended just for keys that can
 * be set by users, not for keys that are generally used within pig.
 */
public class PigConfiguration {
    private PigConfiguration() {}

    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////       COMMAND LINE KEYS       /////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////

    /**
     * Controls the fraction of total memory that is allowed to be used by
     * cached bags. Default is 0.2.
     */
    public static final String PROP_CACHEDBAG_MEMUSAGE = "pig.cachedbag.memusage";

    /**
     * Controls whether partial aggregation is turned on
     */
    public static final String PROP_EXEC_MAP_PARTAGG = "pig.exec.mapPartAgg";

    /**
     * Controls the minimum reduction in-mapper Partial Aggregation should achieve in order
     * to stay on. If after a period of observation this reduction is not achieved,
     * in-mapper aggregation will be turned off and a message logged to that effect.
     */
    public static final String PARTAGG_MINREDUCTION = "pig.exec.mapPartAgg.minReduction";

    /**
     * Controls whether execution time of Pig UDFs should be tracked.
     * This feature uses counters; use judiciously.
     */
    public static final String TIME_UDFS_PROP = "pig.udf.profile";

    /**
     * This key must be set to true by the user for code generation to be used.
     * In the future, it may be turned on by default (at least in certain cases),
     * but for now it is too experimental.
     */
    public static final String SHOULD_USE_SCHEMA_TUPLE = "pig.schematuple";

    public static final String SCHEMA_TUPLE_SHOULD_USE_IN_UDF = "pig.schematuple.udf";

    public static final String SCHEMA_TUPLE_SHOULD_USE_IN_FOREACH = "pig.schematuple.foreach";

    public static final String SCHEMA_TUPLE_SHOULD_USE_IN_FRJOIN = "pig.schematuple.fr_join";

    public static final String SCHEMA_TUPLE_SHOULD_USE_IN_MERGEJOIN = "pig.schematuple.merge_join";

    public static final String SCHEMA_TUPLE_SHOULD_ALLOW_FORCE = "pig.schematuple.force";

    /*
     * Turns off use of combiners in MapReduce jobs produced by Pig.
     */
    public static final String PROP_NO_COMBINER = "pig.exec.nocombiner";

    /**
     * This key can be used to defined what properties will be set in the streaming environment.
     * Just set this property to a comma-delimited list of properties to set, and those properties
     * will be set in the environment.
     */
    public static final String PIG_STREAMING_ENVIRONMENT = "pig.streaming.environment";

    public static final String PIG_CROSS_PARALLELISM_HINT = "pig.cross.parallelism.hint";

    public static final String REDUCER_ESTIMATOR_KEY = "pig.exec.reducer.estimator";
    public static final String REDUCER_ESTIMATOR_ARG_KEY =  "pig.exec.reducer.estimator.arg";
}
