/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included  with this distribution in
 * the LICENSE.txt file.
 */
package org.apache.commons.vfs.provider;

import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSelectInfo;

/**
 * A default {@link FileSelectInfo} implementation.
 *
 * @author <a href="mailto:adammurdoch@apache.org">Adam Murdoch</a>
 * @version $Revision: 1.2 $ $Date: 2002/07/05 04:08:17 $
 */
final class DefaultFileSelectorInfo
    implements FileSelectInfo
{
    private FileObject m_baseFolder;
    private FileObject m_file;
    private int m_depth;

    public FileObject getBaseFolder()
    {
        return m_baseFolder;
    }

    public void setBaseFolder( final FileObject baseFolder )
    {
        m_baseFolder = baseFolder;
    }

    public FileObject getFile()
    {
        return m_file;
    }

    public void setFile( final FileObject file )
    {
        m_file = file;
    }

    public int getDepth()
    {
        return m_depth;
    }

    public void setDepth( final int depth )
    {
        m_depth = depth;
    }
}
