/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 */
package org.apache.commons.vfs.provider.zip;

import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.provider.ParsedUri;

/**
 * A parsed Zip URI.
 *
 * @author <a href="mailto:adammurdoch@apache.org">Adam Murdoch</a>
 * @version $Revision: 1.4 $ $Date: 2002/07/05 04:08:19 $
 */
public final class ParsedZipUri
    extends ParsedUri
{
    private String m_zipFileName;
    private FileObject m_zipFile;

    public String getZipFileName()
    {
        return m_zipFileName;
    }

    public void setZipFileName( final String zipFileName )
    {
        m_zipFileName = zipFileName;
    }

    public FileObject getZipFile()
    {
        return m_zipFile;
    }

    public void setZipFile( final FileObject zipFile )
    {
        m_zipFile = zipFile;
    }
}
