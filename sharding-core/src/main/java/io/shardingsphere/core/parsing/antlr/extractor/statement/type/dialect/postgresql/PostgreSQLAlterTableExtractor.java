/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.core.parsing.antlr.extractor.statement.type.dialect.postgresql;

import io.shardingsphere.core.parsing.antlr.extractor.statement.clause.AddColumnExtractor;
import io.shardingsphere.core.parsing.antlr.extractor.statement.clause.AddPrimaryKeyExtractor;
import io.shardingsphere.core.parsing.antlr.extractor.statement.clause.ModifyColumnExtractor;
import io.shardingsphere.core.parsing.antlr.extractor.statement.clause.RenameColumnExtractor;
import io.shardingsphere.core.parsing.antlr.extractor.statement.clause.RuleName;
import io.shardingsphere.core.parsing.antlr.extractor.statement.type.AlterTableExtractor;

/**
 * Postgre alter table statement extractor.
 * 
 * @author duhongjun
 */
public final class PostgreSQLAlterTableExtractor extends AlterTableExtractor {
    
    public PostgreSQLAlterTableExtractor() {
        addExtractHandler(new AddColumnExtractor());
        addExtractHandler(new AddPrimaryKeyExtractor(RuleName.ALTER_TABLE_ADD_CONSTRAINT));
        addExtractHandler(new ModifyColumnExtractor());
        addExtractHandler(new RenameColumnExtractor());
    }
}
