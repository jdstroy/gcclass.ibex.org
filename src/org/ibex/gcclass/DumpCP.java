// Copyright 2000-2005 the Contributors, as shown in the revision logs.
// Licensed under the Apache Public Source License 2.0 ("the License").
// You may not use this file except in compliance with the License.

package org.ibex.gcclass;

import java.util.*;
import java.io.*;
import org.apache.bcel.util.*;
import org.apache.bcel.classfile.*;

public class DumpCP {
    public static void main(String[] args) throws Exception {
        if(args.length < 2) {
            System.err.println("Usage DumpCP classpath class");
            System.exit(1);
        }
        String classpath = ClassPath.SYSTEM_CLASS_PATH + File.pathSeparator + args[0];
        Repository repo = SyntheticRepository.getInstance(new ClassPath(classpath));
        
        JavaClass c = repo.loadClass(args[1]);
        ConstantPool cp = c.getConstantPool();
        System.out.println(cp);
    }
}
