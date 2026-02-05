import SwiftUI
struct dialog_owncloud_account: View {
    
    var body: some View {
        VStack
        {
            TextField("https://", text: .constant(""))
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.top,16)
                .padding(.bottom,4)
                .padding(.leading,4)
                .padding(.trailing,4)
            Text("")
                .frame(minWidth:0,maxWidth:.infinity)
                .foregroundColor(Color(red:0.75686276,green:0.105882354,blue:0.09019608,opacity:1.0))
            TextField("User Name", text: .constant(""))
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.top,16)
                .padding(.bottom,4)
                .padding(.leading,4)
                .padding(.trailing,4)
            Text("")
                .frame(minWidth:0,maxWidth:.infinity)
                .foregroundColor(Color(red:0.75686276,green:0.105882354,blue:0.09019608,opacity:1.0))
            TextField("Password", text: .constant(""))
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.top,4)
                .padding(.bottom,16)
                .padding(.leading,4)
                .padding(.trailing,4)
            TextField("", text: .constant(""))
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.top,16)
                .padding(.bottom,4)
                .padding(.leading,4)
                .padding(.trailing,4)
            Text("")
                .frame(minWidth:0,maxWidth:.infinity)
                .foregroundColor(Color(red:0.75686276,green:0.105882354,blue:0.09019608,opacity:1.0))
            VStack
            {
                Rectangle()
                    .frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
                HStack
                {
                    Button(action: {})
                    {
                        Text("Cancel")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.blue)
                    Button(action: {})
                    {
                        Text("Save")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.blue)
                }
                .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            .padding(.top,5)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct dialog_owncloud_account_Previews: PreviewProvider {
    static var previews: some View {
        dialog_owncloud_account()
    }
}
