package org.umlg.sqlg.groovy.plugin;

import org.apache.tinkerpop.gremlin.groovy.plugin.GremlinPlugin;
import org.apache.tinkerpop.gremlin.groovy.plugin.IllegalEnvironmentException;
import org.apache.tinkerpop.gremlin.groovy.plugin.PluginAcceptor;
import org.apache.tinkerpop.gremlin.groovy.plugin.PluginInitializationException;
import org.umlg.sqlg.structure.SqlgGraph;

import java.util.HashSet;
import java.util.Set;

/**
 * Date: 2014/10/11
 * Time: 9:55 AM
 */
public class SqlgMSSqlServerGremlinPlugin implements GremlinPlugin {

    private static final String IMPORT = "import ";
    private static final String DOT_STAR = ".*";

    private static final Set<String> IMPORTS = new HashSet<String>() {{
        add(IMPORT + SqlgGraph.class.getPackage().getName() + DOT_STAR);
    }};

    @Override
    public String getName() {
        return "sqlg.mssqlserver";
    }

    @Override
    public void pluginTo(final PluginAcceptor pluginAcceptor) throws PluginInitializationException, IllegalEnvironmentException {
        pluginAcceptor.addImports(IMPORTS);
    }
}
