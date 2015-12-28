package de.thetaphi.forbiddenapis;

import java.util.Locale;

/*
 * (C) Copyright Uwe Schindler (Generics Policeman) and others.
 * Parts of this work are licensed to the Apache Software Foundation (ASF)
 * under one or more contributor license agreements.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public interface Constants {

  final String BS_JDK_NONPORTABLE = "jdk-nonportable";
  
  final String DEPRECATED_WARN_INTERNALRUNTIME = String.format(Locale.ENGLISH,
      "The setting 'internalRuntimeForbidden' was deprecated and will be removed in next version. For backwards compatibility task/mojo is using '%s' bundled signatures instead.", BS_JDK_NONPORTABLE);
  
}
