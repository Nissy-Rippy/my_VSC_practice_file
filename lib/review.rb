class ChatsController < ApplicationController
  def show
    @user = User.find(params[:id])
    rooms = current_user.user_rooms.pluck(:room_id)
    user_rooms = UserRoom.find_by(user_id: @user.id, room_id: rooms)
    if user_rooms.nil?
      @room = Room.new
      @room.save
      UserRoom.create(user_id: current_user.id, room_id: @room.id)
      UserRoom.create(user_id: @user.id, room_id: @room.id)
    else
      @room = user_rooms.room
    end
    @chats = @room.chats.includes(:user)
    @chat = Chat.new(room_id: @room.id)
  end

  def index
    @group = Group.find(params[:group_id])
    if @group.users.where(id: current_user.id).empty?
      redirect_to group_path(@group)
      return
    end
    @users = @group.users
    rooms = current_user.user_rooms.pluck(:room_id)
    user_rooms = UserRoom.find_by(room_id: rooms, group_id: @group.id)
    if user_rooms.nil?
      @room = Room.new(group_id: @group.id)
      @room.save 

      @users.each do |user|
        UserRoom.create(user_id: user.id, room_id: @room.id, group_id: @group.id)
      end
    else
      @room = @group.room
    end

    @chats = Chat.includes(:user).where(room_id: @room.id)
    @chat = Chat.new(room_id: @room.id)
  end

  def create
    @chats = current_user.chats.new(chat_params)
    @chats.save
  end
