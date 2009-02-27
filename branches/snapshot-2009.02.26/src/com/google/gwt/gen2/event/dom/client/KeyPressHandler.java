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
package com.google.gwt.gen2.event.dom.client;

import com.google.gwt.gen2.event.shared.EventHandler;

/**
 * Handler interface for {@link KeyPressEvent} events.
 * 
 * @deprecated use the com.google.gwt.event.dom.client classes instead
 */
@Deprecated
public interface KeyPressHandler extends EventHandler {

  /**
   * Called when KeyPressEvent is fired.
   * 
   * @param event the {@link KeyPressEvent} that was fired
   */
  void onKeyPress(KeyPressEvent event);
}