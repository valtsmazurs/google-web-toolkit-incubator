/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

/**
 * Package for mouse/keyboard and other UI events which have no peer browser
 * element as a source or target of the event. Classes in this package may
 * be run in non-Javascript environments, such as the server.
 *
 * Pluggable event propagation models are supported, from events that do not
 * propagation, to those with two phase capture/bubbling in a hierarchy.
 */
package com.google.gwt.libideas.vevent.shared;