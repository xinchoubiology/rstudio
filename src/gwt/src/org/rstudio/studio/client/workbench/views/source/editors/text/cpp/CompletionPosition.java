/*
 * CompletionPosition.java
 *
 * Copyright (C) 2009-12 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */


package org.rstudio.studio.client.workbench.views.source.editors.text.cpp;

import org.rstudio.studio.client.workbench.views.source.editors.text.ace.Position;

public class CompletionPosition
{
   public CompletionPosition(Position position)
   {
      this(position, false);
   }
   
   public CompletionPosition(Position position, boolean memberScope)
   {
      position_ = position;
      memberScope_ = memberScope;
   }
   
   public Position getPosition()
   {
      return position_;
   }
   
   public boolean isMemberScope()
   {
      return memberScope_;
   }
   
   public final int compareTo(CompletionPosition other)
   {
      return getPosition().compareTo(other.getPosition());
   }
   
   private final Position position_;
   private final boolean memberScope_;
   
}