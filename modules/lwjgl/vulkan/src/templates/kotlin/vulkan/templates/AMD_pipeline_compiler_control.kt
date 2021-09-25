/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_pipeline_compiler_control = "AMDPipelineCompilerControl".nativeClassVK("AMD_pipeline_compiler_control", type = "device", postfix = AMD) {
    documentation =
        """
        This extension introduces ##VkPipelineCompilerControlCreateInfoAMD structure that can be chained to a pipeline’s creation information to specify additional flags that affect pipeline compilation.

        <h5>Examples</h5>
        None.

        <h5>VK_AMD_pipeline_compiler_control</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_pipeline_compiler_control}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>184</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_pipeline_compiler_control] @anteru%0A&lt;&lt;Here describe the issue or question you have about the VK_AMD_pipeline_compiler_control extension&gt;&gt;">anteru</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-07-26</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Maciej Jesionowski, AMD</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_PIPELINE_COMPILER_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_PIPELINE_COMPILER_CONTROL_EXTENSION_NAME".."VK_AMD_pipeline_compiler_control"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD".."1000183000"
    )
}