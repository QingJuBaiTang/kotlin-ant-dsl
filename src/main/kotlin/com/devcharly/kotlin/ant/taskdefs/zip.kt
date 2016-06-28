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

import org.apache.tools.ant.taskdefs.Zip
import org.apache.tools.ant.types.ResourceCollection
import org.apache.tools.ant.types.selectors.FileSelector

/******************************************************************************
DO NOT EDIT - this file was generated
******************************************************************************/

fun Ant.zip(
	destfile: String? = null,
	basedir: String? = null,
	compress: Boolean? = null,
	filesonly: Boolean? = null,
	update: Boolean? = null,
	duplicate: Duplicate? = null,
	whenempty: WhenEmpty? = null,
	encoding: String? = null,
	keepcompression: Boolean? = null,
	comment: String? = null,
	level: Int? = null,
	roundup: Boolean? = null,
	preserve0permissions: Boolean? = null,
	uselanguageencodingflag: Boolean? = null,
	createunicodeextrafields: UnicodeExtraField? = null,
	fallbacktoutf8: Boolean? = null,
	zip64mode: Zip64ModeAttribute? = null,
	includes: String? = null,
	excludes: String? = null,
	defaultexcludes: Boolean? = null,
	includesfile: String? = null,
	excludesfile: String? = null,
	casesensitive: Boolean? = null,
	followsymlinks: Boolean? = null,
	nested: (KZip.() -> Unit)? = null)
{
	Zip().execute("zip") { task ->
		if (destfile != null)
			task.setDestFile(project.resolveFile(destfile))
		if (basedir != null)
			task.setBasedir(project.resolveFile(basedir))
		if (compress != null)
			task.setCompress(compress)
		if (filesonly != null)
			task.setFilesonly(filesonly)
		if (update != null)
			task.setUpdate(update)
		if (duplicate != null)
			task.setDuplicate(Zip.Duplicate().apply { value = duplicate.value })
		if (whenempty != null)
			task.setWhenempty(Zip.WhenEmpty().apply { value = whenempty.value })
		if (encoding != null)
			task.setEncoding(encoding)
		if (keepcompression != null)
			task.setKeepCompression(keepcompression)
		if (comment != null)
			task.setComment(comment)
		if (level != null)
			task.setLevel(level)
		if (roundup != null)
			task.setRoundUp(roundup)
		if (preserve0permissions != null)
			task.setPreserve0Permissions(preserve0permissions)
		if (uselanguageencodingflag != null)
			task.setUseLanguageEncodingFlag(uselanguageencodingflag)
		if (createunicodeextrafields != null)
			task.setCreateUnicodeExtraFields(Zip.UnicodeExtraField().apply { value = createunicodeextrafields.value })
		if (fallbacktoutf8 != null)
			task.setFallBackToUTF8(fallbacktoutf8)
		if (zip64mode != null)
			task.setZip64Mode(Zip.Zip64ModeAttribute().apply { value = zip64mode.value })
		if (includes != null)
			task.setIncludes(includes)
		if (excludes != null)
			task.setExcludes(excludes)
		if (defaultexcludes != null)
			task.setDefaultexcludes(defaultexcludes)
		if (includesfile != null)
			task.setIncludesfile(project.resolveFile(includesfile))
		if (excludesfile != null)
			task.setExcludesfile(project.resolveFile(excludesfile))
		if (casesensitive != null)
			task.setCaseSensitive(casesensitive)
		if (followsymlinks != null)
			task.setFollowSymlinks(followsymlinks)
		if (nested != null)
			nested(KZip(task))
	}
}

class KZip(override val component: Zip) : IFileSelectorNested, IResourceCollectionNested {
	fun include(name: String? = null, If: String? = null, unless: String? = null) {
		component.createInclude().apply {
			_init(name, If, unless)
		}
	}
	fun exclude(name: String? = null, If: String? = null, unless: String? = null) {
		component.createExclude().apply {
			_init(name, If, unless)
		}
	}
	fun patternset(includes: String? = null, excludes: String? = null, includesfile: String? = null, excludesfile: String? = null, nested: (KPatternSet.() -> Unit)? = null) {
		component.createPatternSet().apply {
			_init(includes, excludes, includesfile, excludesfile, nested)
		}
	}
	override fun _addFileSelector(value: FileSelector) = component.add(value)
	override fun _addResourceCollection(value: ResourceCollection) = component.add(value)
}

enum class Duplicate(val value: String) { ADD("add"), PRESERVE("preserve"), FAIL("fail") }
enum class WhenEmpty(val value: String) { FAIL("fail"), SKIP("skip"), CREATE("create") }
enum class UnicodeExtraField(val value: String) { NEVER("never"), ALWAYS("always"), NOT_ENCODEABLE("not-encodeable") }
enum class Zip64ModeAttribute(val value: String) { NEVER("never"), ALWAYS("always"), AS_NEEDED("as-needed") }