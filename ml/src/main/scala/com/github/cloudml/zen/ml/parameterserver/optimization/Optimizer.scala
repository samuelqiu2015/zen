/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.cloudml.zen.ml.parameterserver.optimization

import org.apache.spark.rdd.RDD

import org.apache.spark.annotation.DeveloperApi
import org.apache.spark.mllib.linalg.Vector

/**
 * :: DeveloperApi ::
 * Trait for optimization problem solvers.
 */
@DeveloperApi
trait Optimizer extends Serializable {

  /**
   * Solve the provided convex optimization problem.
   */
  def optimize(data: RDD[(Vector, Vector)], initialWeights: Vector): Vector
}