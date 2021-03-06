package org.mapfish.print.map.geotools;

import org.geotools.data.FeatureSource;
import org.mapfish.print.attribute.map.MapfishMapContext;
import org.mapfish.print.http.MfClientHttpRequestFactory;

import javax.annotation.Nonnull;

/**
 * Function for creating feature source.
 *
 * @author Jesse on 7/3/2014.
 */
public interface FeatureSourceSupplier {
    /**
     * Load/create feature source.
     *  @param requestFactory the factory to use for making http requests
     * @param mapContext object containing the map information like bounds, map size, dpi, rotation, etc...
     */
    @Nonnull
    FeatureSource load(@Nonnull final MfClientHttpRequestFactory requestFactory,
                       @Nonnull MapfishMapContext mapContext);
}
