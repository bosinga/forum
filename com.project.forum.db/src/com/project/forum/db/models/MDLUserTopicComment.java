package com.project.forum.db.models;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MDLUserTopicComment {
	private int userTopicCommentId;
	private int userTopicId;
	private String userName;
	private String description;
	private Date createdDate;
	private Date modifiedDate;
	private String status;
	private String evaluation;
	
	public MDLUserTopicComment(){
		
	}

	public int getUserTopicCommentId() {
		return userTopicCommentId;
	}

	public void setUserTopicCommentId(int userTopicCommentId) {
		this.userTopicCommentId = userTopicCommentId;
	}

	public int getUserTopicId() {
		return userTopicId;
	}

	public void setUserTopicId(int userTopicId) {
		this.userTopicId = userTopicId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((evaluation == null) ? 0 : evaluation.hashCode());
		result = prime * result
				+ ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + userTopicCommentId;
		result = prime * result + userTopicId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MDLUserTopicComment other = (MDLUserTopicComment) obj;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (evaluation == null) {
			if (other.evaluation != null)
				return false;
		} else if (!evaluation.equals(other.evaluation))
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userTopicCommentId != other.userTopicCommentId)
			return false;
		if (userTopicId != other.userTopicId)
			return false;
		return true;
	}
	
}
