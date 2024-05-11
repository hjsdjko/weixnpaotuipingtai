<template>
	<view class="content">
		<form class="app-update-pv">
			<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
			 class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}' class="title">任务编号</view>
				<input disabled :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"0px","color":"#008761","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
				 :disabled="ro.paotuirenwuUuidNumber" type="text" v-model="ruleForm.paotuirenwuUuidNumber" placeholder="任务编号"></input>
			</view>
			<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
			 class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}' class="title">任务标题</view>
				<input disabled :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"0px","color":"#008761","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
				 :disabled="ro.paotuirenwuName" type="text" v-model="ruleForm.paotuirenwuName" placeholder="任务标题"></input>
			</view>
			<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
			 class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}' class="title">任务类型</view>
				<picker @change="paotuirenwuTypesChange" :value="paotuirenwuTypesIndex" :range="paotuirenwuTypesOptions" range-key="indexName">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"0px","color":"#008761","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					 class="uni-input">{{ruleForm.paotuirenwuTypes?ruleForm.paotuirenwuValue:"请选择任务类型"}}</view>
				</picker>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
			 class="cu-form-group" @tap="paotuirenwuPhotoTap">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}' class="title">封面</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
					 class="avator" v-if="ruleForm.paotuirenwuPhoto" :src="ruleForm.paotuirenwuPhoto" mode="aspectFill">
					</image>
					<image :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
					 class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
			 class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}' class="title">收货人</view>
				<input disabled :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"0px","color":"#008761","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
				 :disabled="ro.paotuirenwuShouhbuoren" type="text" v-model="ruleForm.paotuirenwuShouhbuoren" placeholder="收货人"></input>
			</view>
			<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
			 class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}' class="title">单价</view>
				<input disabled :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"0px","color":"#008761","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
				 :disabled="ro.paotuirenwuNewMoney" type="number" v-model="ruleForm.paotuirenwuNewMoney" placeholder="单价"></input>
			</view>
			
			<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
			 class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}' class="title">电话</view>
				<input disabled :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"0px","color":"#008761","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
				 :disabled="ro.paotuirenwuPhone" type="text" v-model="ruleForm.paotuirenwuPhone" placeholder="电话"></input>
			</view>
			<view @click="chooseLocation" :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
			 class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}' class="title">地址</view>
				<input disabled :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"0px","color":"#008761","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
				 :disabled="ro.paotuirenwuDizhi" type="text" v-model="ruleForm.paotuirenwuDizhi" placeholder="地址"></input>
			</view>
			<!-- text后缀 -->
			<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
			 class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}' class="title">备注</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"0px","color":"#008761","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
				 :disabled="ro.paotuirenwuText" v-model="ruleForm.paotuirenwuText" placeholder="备注" />
				</view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#008761","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
                              ref="createTime" themeColor="#333333"></w-picker>


    </view>
</template>

<script>
    import wPicker from "@/components/w-picker/w-picker.vue";

    export default {
        data() {
            return {
                cross: '',
                ro:{
					paotuirenwuUuidNumber: true,
					paotuirenwuName: false,
					paotuirenwuTypes: false,
					paotuirenwuNewMoney: false,
					paotuirenwuPhoto: false,
					yonghuId: false,
					paotuirenwuShouhbuoren: false,
					paotuirenwuPhone: false,
					paotuirenwuDizhi: false,
					paotuirenwuText: false,
					paotuirenwuStatusTypes: false,
					createTime: false,
        },
            ruleForm: {
					paotuirenwuUuidNumber: this.getUUID(),//数字
					paotuirenwuName: '',
					paotuirenwuTypes: '',//数字
					paotuirenwuValue: '',//数字对应的值
					paotuirenwuNewMoney: '',
					paotuirenwuPhoto: '',
					yonghuId: '',
					paotuirenwuShouhbuoren: '',
					paotuirenwuPhone: '',
					paotuirenwuDizhi: '',
					paotuirenwuText: '',
					paotuirenwuStatusTypes: '1',//数字
					paotuirenwuStatusValue: '',//数字对应的值
					createTime: '',
            },
            // 登陆用户信息
            user: {},
				paotuirenwuTypesOptions: [],
							paotuirenwuTypesIndex : 0,
				paotuirenwuStatusTypesOptions: [],
							paotuirenwuStatusTypesIndex : 0,

        }
        },
        components: {
            wPicker
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
        async onLoad(options) {

		/*下拉框*/
			let paotuirenwuTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'paotuirenwu_types',
            }
			let paotuirenwuTypes = await this.$api.page(`dictionary`, paotuirenwuTypesParams);
			this.paotuirenwuTypesOptions = paotuirenwuTypes.data.list
		/*下拉框*/
			let paotuirenwuStatusTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'paotuirenwu_status_types',
            }
			let paotuirenwuStatusTypes = await this.$api.page(`dictionary`, paotuirenwuStatusTypesParams);
			this.paotuirenwuStatusTypesOptions = paotuirenwuStatusTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`paotuirenwu`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.paotuirenwuId){
                this.ruleForm.paotuirenwuId = options.paotuirenwuId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            paotuirenwuTypesChange(e) {
                this.paotuirenwuTypesIndex = e.target.value
                this.ruleForm.paotuirenwuValue = this.paotuirenwuTypesOptions[this.paotuirenwuTypesIndex].indexName
                this.ruleForm.paotuirenwuTypes = this.paotuirenwuTypesOptions[this.paotuirenwuTypesIndex].codeIndex
            },
            paotuirenwuStatusTypesChange(e) {
                this.paotuirenwuStatusTypesIndex = e.target.value
                this.ruleForm.paotuirenwuStatusValue = this.paotuirenwuStatusTypesOptions[this.paotuirenwuStatusTypesIndex].indexName
                this.ruleForm.paotuirenwuStatusTypes = this.paotuirenwuStatusTypesOptions[this.paotuirenwuStatusTypesIndex].codeIndex
            },


            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },


			paotuirenwuPhotoTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.paotuirenwuPhoto = _this.$base.url + 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			// 日期控件
			createTimeConfirm(val) {
                console.log(val)
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },

chooseLocation() {
				let _this = this
				uni.chooseLocation({
					success: (data) => {
						_this.ruleForm.paotuirenwuDizhi = data.address+data.name;
					}
				})
			},


            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.paotuirenwuUuidNumber)) {
                    this.$utils.msg(`任务编号不能为空`);
                    return
                }
				if ((!this.ruleForm.paotuirenwuName)) {
                    this.$utils.msg(`任务标题不能为空`);
                    return
                }
				if ((!this.ruleForm.paotuirenwuPhoto)) {
                    this.$utils.msg(`封面不能为空`);
                    return
                }
				if ((!this.ruleForm.paotuirenwuShouhbuoren)) {
                    this.$utils.msg(`收货人不能为空`);
                    return
                }
				if ((!this.ruleForm.paotuirenwuPhone) && (!this.$validate.isMobile(this.ruleForm.paotuirenwuPhone))) {
                    this.$utils.msg(`电话不能为空并且需要输入正确格式`);
                    return
                }
				if ((!this.ruleForm.paotuirenwuDizhi)) {
                    this.$utils.msg(`地址不能为空`);
                    return
                }
				if ((!this.ruleForm.paotuirenwuNewMoney)) {
				    this.$utils.msg(`单价不能为空`);
				    return
				}
				if ((!this.ruleForm.paotuirenwuText)) {
                    this.$utils.msg(`备注不能为空`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`paotuirenwu`, this.ruleForm);
                } else {
                    await this.$api.save(`paotuirenwu`, this.ruleForm);
                }
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
            },
            getDate(type) {
                const date = new Date();
                let year = date.getFullYear();
                let month = date.getMonth() + 1;
                let day = date.getDate();
                if (type === 'start') {
                    year = year - 60;
                } else if (type === 'end') {
                    year = year + 2;
                }
                month = month > 9 ? month : '0' + month;;
                day = day > 9 ? day : '0' + day;
                return `${year}-${month}-${day}`;
            },
            toggleTab(str) {
                this.$refs[str].show();
            }
        }
    }
</script>

<style lang="scss" scoped>
    .container {
        padding: 20upx;
    }

    .content:after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    textarea {
        border: 1upx solid #EEEEEE;
        border-radius: 20upx;
        padding: 20upx;
    }

    .title {
        width: 180upx;
    }

    .avator {
        width: 150upx;
        height: 60upx;
    }

    .right-input {
        flex: 1;
        text-align: left;
        padding: 0 24upx;
    }

    .cu-form-group.active {
        justify-content: space-between;
    }

    .btn {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-wrap: wrap;
        padding: 20upx 0;
    }

    .cu-form-group {
        padding: 0 24upx;
        background-color: transparent;
        min-height: inherit;
    }

    .cu-form-group+.cu-form-group {
        border: 0;
    }

    .cu-form-group uni-input {
        padding: 0 30upx;
    }

    .uni-input {
        padding: 0 30upx;
    }

    .cu-form-group uni-textarea {
        padding: 30upx;
        margin: 0;
    }

    .cu-form-group uni-picker::after {
        line-height: 68rpx;
    }

    .select .uni-input {
        line-height: 68rpx;
    }

    .input .right-input {
        line-height: 68rpx;
    }
</style>
