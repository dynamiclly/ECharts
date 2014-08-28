/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts.util;

import com.github.abel533.echarts.Option;

/**
 * 增强的Option - 主要用于测试、演示
 *
 * @author liuzh
 */
public class EnhancedOption extends Option {

    @Override
    public String toString() {
        return GsonFormatter.format(this);
    }

    /**
     * 输出到控制台
     */
    public void print() {
        GsonFormatter.print(this);
    }

    /**
     * 在浏览器中查看
     */
    public void view() {
        OptionUtil.browse(this);
    }

    /**
     * 导出到html（tmp文件夹）
     *
     * @return 返回html路径
     */
    public String exportToHtml() {
        String folderPath = System.getProperty("java.io.tmpdir");
        return OptionUtil.exportToHtml(this, folderPath);
    }

    /**
     * 导出到指定文件夹，文件名随机
     *
     * @param folderPath
     * @return 返回html路径
     */
    public String exportToHtml(String folderPath) {
        String fileName = "ECharts-" + System.currentTimeMillis() + ".html";
        return OptionUtil.exportToHtml(this, folderPath, fileName);
    }

    /**
     * 导出到指定文件
     *
     * @param folderPath
     * @param fileName
     * @return 返回html路径
     */
    public String exportToHtml(String folderPath, String fileName) {
        return OptionUtil.exportToHtml(this, folderPath, fileName);
    }
}
