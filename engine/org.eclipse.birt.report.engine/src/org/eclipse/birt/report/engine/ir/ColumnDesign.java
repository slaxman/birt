/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.ir;

/**
 * Column define.
 * 
 * @see TableItemDesign
 * @see GridItemDesign
 * @version $Revision: 1.6 $ $Date: 2005/11/11 06:26:41 $
 */
public class ColumnDesign extends StyledElementDesign
{
	/**
	 * width of this column
	 */
	protected DimensionType width;

	/**
	 * suppressDuplicate
	 */
	protected boolean suppressDuplicate = false; 

	/**
	 * @return Returns the width.
	 */
	public DimensionType getWidth( )
	{
		return width;
	}

	/**
	 * @param width
	 *            The width to set.
	 */
	public void setWidth( DimensionType width )
	{
		this.width = width;
	}
	
	/**
	 * @param suppress
	 *            The suppressDuplicate to set.
	 */
	public void setSuppressDuplicate(boolean suppress)
	{
		suppressDuplicate = suppress;
	}
	
	/**
	 * @return Returns the suppressDuplicate.
	 */
	public boolean getSuppressDuplicate()
	{
		return suppressDuplicate;
	}
}
