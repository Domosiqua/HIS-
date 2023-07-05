// 查询列表数据
const queryDetail = (params) => {
  return $axios({
    url: `/register`,
    method: 'get',
    params: params
  })
}

// 新增数据接口
const add = (params) => {
  return $axios({
    url: '/register',
    method: 'post',
    data: { ...params }
  })
}

// 查询详情接口
const querySetmealById = (id) => {
  return $axios({
    url: `/setmeal/${id}`,
    method: 'get'
  })
}

// 批量起售禁售
const setmealStatusByStatus = (params) => {
  return $axios({
    url: `/setmeal/status/${params.status}`,
    method: 'post',
    params: { ids: params.ids }
  })
}
