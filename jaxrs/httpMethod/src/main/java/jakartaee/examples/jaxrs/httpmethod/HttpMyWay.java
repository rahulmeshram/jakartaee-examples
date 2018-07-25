/*
 * Permission to use, copy, modify, and/or distribute this software for any 
 * purpose with or without fee is hereby granted.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR(S) DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR(S) BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION
 * OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
 * CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package jakartaee.examples.jaxrs.httpmethod;

import java.net.URI;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * A custom MYWAY HTTP method.
 *
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class HttpMyWay extends HttpRequestBase {
    
    /**
     * Constructor.
     */
    public HttpMyWay() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param uri the URI.
     */
    public HttpMyWay(final URI uri) {
        super();
        setURI(uri);
    }
    
    /**
     * Constructor.
     * 
     * @param uri the URI.
     */
    public HttpMyWay(final String uri) {
        super();
        setURI(URI.create(uri));
    }

    /**
     * Get the method.
     *
     * @return the method.
     */
    @Override
    public String getMethod() {
        return "MYWAY";
    }
}
