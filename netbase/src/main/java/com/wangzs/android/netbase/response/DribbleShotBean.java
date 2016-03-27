package com.wangzs.android.netbase.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzs on 2016/3/27.
 */
public class DribbleShotBean {

    /**
     * id : 2613526
     * title : easter egg - 1 Invite
     * description : <p>I have one dribbble invite. Please send me a link to your portfolio ;)</p>
     * width : 400
     * height : 300
     * images : {"hidpi":"https://d13yacurqjgara.cloudfront.net/users/153131/screenshots/2613526/egg.png",
     *            "normal":"https://d13yacurqjgara.cloudfront.net/users/153131/screenshots/2613526/egg_1x.png",
     *            "teaser":"https://d13yacurqjgara.cloudfront.net/users/153131/screenshots/2613526/egg_teaser.png"}
     * views_count : 1138
     * likes_count : 89
     * comments_count : 4
     * attachments_count : 0
     * rebounds_count : 0
     * buckets_count : 0
     * created_at : 2016-03-26T10:59:59Z
     * updated_at : 2016-03-26T11:01:24Z
     * html_url : https://dribbble.com/shots/2613526-easter-egg-1-Invite
     * attachments_url : https://api.dribbble.com/v1/shots/2613526/attachments
     * buckets_url : https://api.dribbble.com/v1/shots/2613526/buckets
     * comments_url : https://api.dribbble.com/v1/shots/2613526/comments
     * likes_url : https://api.dribbble.com/v1/shots/2613526/likes
     * projects_url : https://api.dribbble.com/v1/shots/2613526/projects
     * rebounds_url : https://api.dribbble.com/v1/shots/2613526/rebounds
     * animated : false
     * tags : ["dribbble","easter","egg","invite"]
     * user : {"id":153131,
     *          "name":"Andreas Storm",
     *          "username":"andreasstorm",
     *          "html_url":"https://dribbble.com/andreasstorm",
     *          "avatar_url":"https://d13yacurqjgara.cloudfront.net/users/153131/avatars/normal/ea6ce114f8a8de3ede8bf1f05f8c893d.png?1441482456",
     *          "bio":"UX/UI Designer ∙ <a href=\"http://colourco.de\" rel=\"nofollow noreferrer\">colourco.de<\/a> ∙ <a href=\"http://four-zero-four.com\" rel=\"nofollow noreferrer\">four-zero-four.com<\/a>",
     *          "location":"Berlin",
     *          "links":{"twitter":"https://twitter.com/st8rmi"},
     *          "buckets_count":10,
     *          "comments_received_count":339,
     *          "followers_count":2799,
     *          "followings_count":1783,
     *          "likes_count":1448,
     *          "likes_received_count":6916,
     *          "projects_count":0,
     *          "rebounds_received_count":7,
     *          "shots_count":38,
     *          "teams_count":0,
     *          "can_upload_shot":true,
     *          "type":"Player",
     *          "pro":true,
     *          "buckets_url":"https://api.dribbble.com/v1/users/153131/buckets",
     *          "followers_url":"https://api.dribbble.com/v1/users/153131/followers",
     *          "following_url":"https://api.dribbble.com/v1/users/153131/following",
     *          "likes_url":"https://api.dribbble.com/v1/users/153131/likes",
     *          "projects_url":"https://api.dribbble.com/v1/users/153131/projects",
     *          "shots_url":"https://api.dribbble.com/v1/users/153131/shots",
     *          "teams_url":"https://api.dribbble.com/v1/users/153131/teams",
     *          "created_at":"2012-05-24T18:55:49Z",
     *          "updated_at":"2016-03-26T11:01:24Z"
     * }
     * team : null
     */

    private int id;
    private String title;
    private String description;
    private int width;
    private int height;
    /**
     * hidpi : https://d13yacurqjgara.cloudfront.net/users/153131/screenshots/2613526/egg.png
     * normal : https://d13yacurqjgara.cloudfront.net/users/153131/screenshots/2613526/egg_1x.png
     * teaser : https://d13yacurqjgara.cloudfront.net/users/153131/screenshots/2613526/egg_teaser.png
     */

    private ImagesBean images;
    private int views_count;
    private int likes_count;
    private int comments_count;
    private int attachments_count;
    private int rebounds_count;
    private int buckets_count;
    private String created_at;
    private String updated_at;
    private String html_url;
    private String attachments_url;
    private String buckets_url;
    private String comments_url;
    private String likes_url;
    private String projects_url;
    private String rebounds_url;
    private boolean animated;
    /**
     * id : 153131
     * name : Andreas Storm
     * username : andreasstorm
     * html_url : https://dribbble.com/andreasstorm
     * avatar_url : https://d13yacurqjgara.cloudfront.net/users/153131/avatars/normal/ea6ce114f8a8de3ede8bf1f05f8c893d.png?1441482456
     * bio : UX/UI Designer ∙ <a href="http://colourco.de" rel="nofollow noreferrer">colourco.de</a> ∙ <a href="http://four-zero-four.com" rel="nofollow noreferrer">four-zero-four.com</a>
     * location : Berlin
     * links : {"twitter":"https://twitter.com/st8rmi"}
     * buckets_count : 10
     * comments_received_count : 339
     * followers_count : 2799
     * followings_count : 1783
     * likes_count : 1448
     * likes_received_count : 6916
     * projects_count : 0
     * rebounds_received_count : 7
     * shots_count : 38
     * teams_count : 0
     * can_upload_shot : true
     * type : Player
     * pro : true
     * buckets_url : https://api.dribbble.com/v1/users/153131/buckets
     * followers_url : https://api.dribbble.com/v1/users/153131/followers
     * following_url : https://api.dribbble.com/v1/users/153131/following
     * likes_url : https://api.dribbble.com/v1/users/153131/likes
     * projects_url : https://api.dribbble.com/v1/users/153131/projects
     * shots_url : https://api.dribbble.com/v1/users/153131/shots
     * teams_url : https://api.dribbble.com/v1/users/153131/teams
     * created_at : 2012-05-24T18:55:49Z
     * updated_at : 2016-03-26T11:01:24Z
     */

    private UserBean user;
    private Object team;
    private List<String> tags;

    public static List<DribbleShotBean> arrayDribbleShotsRspFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<DribbleShotBean>>() {
            }.getType();

            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public int getViews_count() {
        return views_count;
    }

    public void setViews_count(int views_count) {
        this.views_count = views_count;
    }

    public int getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(int likes_count) {
        this.likes_count = likes_count;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getAttachments_count() {
        return attachments_count;
    }

    public void setAttachments_count(int attachments_count) {
        this.attachments_count = attachments_count;
    }

    public int getRebounds_count() {
        return rebounds_count;
    }

    public void setRebounds_count(int rebounds_count) {
        this.rebounds_count = rebounds_count;
    }

    public int getBuckets_count() {
        return buckets_count;
    }

    public void setBuckets_count(int buckets_count) {
        this.buckets_count = buckets_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getAttachments_url() {
        return attachments_url;
    }

    public void setAttachments_url(String attachments_url) {
        this.attachments_url = attachments_url;
    }

    public String getBuckets_url() {
        return buckets_url;
    }

    public void setBuckets_url(String buckets_url) {
        this.buckets_url = buckets_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getLikes_url() {
        return likes_url;
    }

    public void setLikes_url(String likes_url) {
        this.likes_url = likes_url;
    }

    public String getProjects_url() {
        return projects_url;
    }

    public void setProjects_url(String projects_url) {
        this.projects_url = projects_url;
    }

    public String getRebounds_url() {
        return rebounds_url;
    }

    public void setRebounds_url(String rebounds_url) {
        this.rebounds_url = rebounds_url;
    }

    public boolean isAnimated() {
        return animated;
    }

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public Object getTeam() {
        return team;
    }

    public void setTeam(Object team) {
        this.team = team;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public static class ImagesBean {
        private String hidpi;
        private String normal;
        private String teaser;

        public static List<ImagesBean> arrayImagesBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<ImagesBean>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getHidpi() {
            return hidpi;
        }

        public void setHidpi(String hidpi) {
            this.hidpi = hidpi;
        }

        public String getNormal() {
            return normal;
        }

        public void setNormal(String normal) {
            this.normal = normal;
        }

        public String getTeaser() {
            return teaser;
        }

        public void setTeaser(String teaser) {
            this.teaser = teaser;
        }
    }

    public static class UserBean {
        private int id;
        private String name;
        private String username;
        private String html_url;
        private String avatar_url;
        private String bio;
        private String location;
        /**
         * twitter : https://twitter.com/st8rmi
         */

        private LinksBean links;
        private int buckets_count;
        private int comments_received_count;
        private int followers_count;
        private int followings_count;
        private int likes_count;
        private int likes_received_count;
        private int projects_count;
        private int rebounds_received_count;
        private int shots_count;
        private int teams_count;
        private boolean can_upload_shot;
        private String type;
        private boolean pro;
        private String buckets_url;
        private String followers_url;
        private String following_url;
        private String likes_url;
        private String projects_url;
        private String shots_url;
        private String teams_url;
        private String created_at;
        private String updated_at;

        public static List<UserBean> arrayUserBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<UserBean>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public LinksBean getLinks() {
            return links;
        }

        public void setLinks(LinksBean links) {
            this.links = links;
        }

        public int getBuckets_count() {
            return buckets_count;
        }

        public void setBuckets_count(int buckets_count) {
            this.buckets_count = buckets_count;
        }

        public int getComments_received_count() {
            return comments_received_count;
        }

        public void setComments_received_count(int comments_received_count) {
            this.comments_received_count = comments_received_count;
        }

        public int getFollowers_count() {
            return followers_count;
        }

        public void setFollowers_count(int followers_count) {
            this.followers_count = followers_count;
        }

        public int getFollowings_count() {
            return followings_count;
        }

        public void setFollowings_count(int followings_count) {
            this.followings_count = followings_count;
        }

        public int getLikes_count() {
            return likes_count;
        }

        public void setLikes_count(int likes_count) {
            this.likes_count = likes_count;
        }

        public int getLikes_received_count() {
            return likes_received_count;
        }

        public void setLikes_received_count(int likes_received_count) {
            this.likes_received_count = likes_received_count;
        }

        public int getProjects_count() {
            return projects_count;
        }

        public void setProjects_count(int projects_count) {
            this.projects_count = projects_count;
        }

        public int getRebounds_received_count() {
            return rebounds_received_count;
        }

        public void setRebounds_received_count(int rebounds_received_count) {
            this.rebounds_received_count = rebounds_received_count;
        }

        public int getShots_count() {
            return shots_count;
        }

        public void setShots_count(int shots_count) {
            this.shots_count = shots_count;
        }

        public int getTeams_count() {
            return teams_count;
        }

        public void setTeams_count(int teams_count) {
            this.teams_count = teams_count;
        }

        public boolean isCan_upload_shot() {
            return can_upload_shot;
        }

        public void setCan_upload_shot(boolean can_upload_shot) {
            this.can_upload_shot = can_upload_shot;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isPro() {
            return pro;
        }

        public void setPro(boolean pro) {
            this.pro = pro;
        }

        public String getBuckets_url() {
            return buckets_url;
        }

        public void setBuckets_url(String buckets_url) {
            this.buckets_url = buckets_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getLikes_url() {
            return likes_url;
        }

        public void setLikes_url(String likes_url) {
            this.likes_url = likes_url;
        }

        public String getProjects_url() {
            return projects_url;
        }

        public void setProjects_url(String projects_url) {
            this.projects_url = projects_url;
        }

        public String getShots_url() {
            return shots_url;
        }

        public void setShots_url(String shots_url) {
            this.shots_url = shots_url;
        }

        public String getTeams_url() {
            return teams_url;
        }

        public void setTeams_url(String teams_url) {
            this.teams_url = teams_url;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public static class LinksBean {
            private String twitter;

            public static List<LinksBean> arrayLinksBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new com.google.gson.reflect.TypeToken<ArrayList<LinksBean>>() {
                    }.getType();

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getTwitter() {
                return twitter;
            }

            public void setTwitter(String twitter) {
                this.twitter = twitter;
            }
        }
    }
}
