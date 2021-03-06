/*
 * Copyright 2016 Karl Tauber
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.devcharly.kotlin.ant

import org.apache.tools.ant.types.selectors.ContainsRegexpSelector

/******************************************************************************
DO NOT EDIT - this file was generated
******************************************************************************/

interface IContainsRegexpSelectorNested : INestedComponent {
	fun containsregexp(
		expression: String? = null,
		casesensitive: Boolean? = null,
		multiline: Boolean? = null,
		singleline: Boolean? = null,
		error: String? = null)
	{
		_addContainsRegexpSelector(ContainsRegexpSelector().apply {
			component.project.setProjectReference(this);
			_init(expression, casesensitive, multiline, singleline,
				error)
		})
	}

	fun _addContainsRegexpSelector(value: ContainsRegexpSelector)
}

fun ContainsRegexpSelector._init(
	expression: String?,
	casesensitive: Boolean?,
	multiline: Boolean?,
	singleline: Boolean?,
	error: String?)
{
	if (expression != null)
		setExpression(expression)
	if (casesensitive != null)
		setCaseSensitive(casesensitive)
	if (multiline != null)
		setMultiLine(multiline)
	if (singleline != null)
		setSingleLine(singleline)
	if (error != null)
		setError(error)
}
