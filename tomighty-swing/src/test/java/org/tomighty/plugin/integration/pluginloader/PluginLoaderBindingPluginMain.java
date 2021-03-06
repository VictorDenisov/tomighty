/*
 * Copyright (c) 2010-2012 Célio Cidral Junior, Dominik Obermaier.
 *
 *       Licensed under the Apache License, Version 2.0 (the "License");
 *       you may not use this file except in compliance with the License.
 *       You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *       Unless required by applicable law or agreed to in writing, software
 *       distributed under the License is distributed on an "AS IS" BASIS,
 *       WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *       See the License for the specific language governing permissions and
 *       limitations under the License.
 */

package org.tomighty.plugin.integration.pluginloader;

import com.google.inject.Injector;
import org.tomighty.plugin.Plugin;
import org.tomighty.plugin.PluginVersion;

import java.awt.*;


public class PluginLoaderBindingPluginMain implements Plugin {
    @Override
    public String getPluginName() {
        return "FakePlugin";
    }

    @Override
    public PluginVersion getPluginVersion() {
        return new PluginVersion(1, 0, 0);
    }

    @Override
    public MenuItem getMenuItem() {
        return null;
    }

    @Override
    public Injector getInjector() {
        return null;
    }
}
