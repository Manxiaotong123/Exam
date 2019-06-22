/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.xiaoandx.exam.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**  
 * <p>汇总表</p> 
 * @ClassName:TotalCollcetSubject   
 * @author: Fuqiang.Wu
 * @since: V0.1 
 * @version V0.1
 */
@ApiModel(value = "汇总表")
@Data
public class TotalCollcetSubject{
	@ApiModelProperty(value =  "id",name = "id")
	private Integer ID;
	@ApiModelProperty(value =  "用户id",name = "userId")
	private Integer userID;
	@ApiModelProperty(value =  "当前累计总分",name = "current_total_score")
	private Integer current_total_score;
	@ApiModelProperty(value =  "累计答对题目总数",name = "correct_number")
	private Integer correct_number;
	@ApiModelProperty(value =  "累计答错题目总数",name = "number_of_errors")
	private Integer number_of_errors;
	@ApiModelProperty(value =  "累计答题总数",name = "total_number_of_answers")
	private Integer total_number_of_answers;

}
